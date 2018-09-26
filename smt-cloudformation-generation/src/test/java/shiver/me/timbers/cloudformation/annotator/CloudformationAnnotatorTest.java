package shiver.me.timbers.cloudformation.annotator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JType;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.InclusionLevel;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verifyZeroInteractions;
import static shiver.me.timbers.data.random.RandomEnums.someEnum;
import static shiver.me.timbers.data.random.RandomStrings.someString;
import static shiver.me.timbers.data.random.RandomThings.someThing;

public class CloudformationAnnotatorTest {

    private GenerationConfig config;
    private CloudformationAnnotator annotator;

    @Before
    public void setUp() {
        config = mock(GenerationConfig.class);
        given(config.getInclusionLevel()).willReturn(someEnum(InclusionLevel.class));
        annotator = new CloudformationAnnotator(config);
    }

    @Test
    public void Can_set_the_Named_name_field_to_be_ignored() {

        final JFieldVar field = mock(JFieldVar.class);
        final JDefinedClass clazz = mock(JDefinedClass.class);
        final String propertyName = someThing("name", "NAME", "Name", "nAmE");
        final JsonNode node = mock(JsonNode.class);

        // Given
        given(clazz.fullName()).willReturn("aws.Named");

        // When
        annotator.propertyField(field, clazz, propertyName, node);

        // Then
        then(field).should().annotate(JsonIgnore.class);
    }

    @Test
    public void Will_do_default_annotations_for_all_other_class() {

        final JFieldVar field = mock(JFieldVar.class);
        final JDefinedClass clazz = mock(JDefinedClass.class);
        final String propertyName = someThing("name", "NAME", "Name", "nAmE");
        final JsonNode node = mock(JsonNode.class);

        final JType type = mock(JType.class);

        // Given
        given(clazz.fullName()).willReturn(someString());
        given(field.annotate(JsonProperty.class)).willReturn(mock(JAnnotationUse.class));
        given(field.type()).willReturn(type);
        given(type.erasure()).willReturn(mock(JType.class));
        given(type.owner()).willReturn(mock(JCodeModel.class));

        // When
        annotator.propertyField(field, clazz, propertyName, node);

        // Then
        then(field).should(never()).annotate(JsonIgnore.class);
    }

    @Test
    public void Will_do_default_annotations_for_all_other_fields() {

        final JFieldVar field = mock(JFieldVar.class);
        final JDefinedClass clazz = mock(JDefinedClass.class);
        final String propertyName = someString();
        final JsonNode node = mock(JsonNode.class);

        final JType type = mock(JType.class);

        // Given
        given(clazz.fullName()).willReturn("aws.Named");
        given(field.annotate(JsonProperty.class)).willReturn(mock(JAnnotationUse.class));
        given(field.type()).willReturn(type);
        given(type.erasure()).willReturn(mock(JType.class));
        given(type.owner()).willReturn(mock(JCodeModel.class));

        // When
        annotator.propertyField(field, clazz, propertyName, node);

        // Then
        then(field).should(never()).annotate(JsonIgnore.class);
    }

    @Test
    public void Will_not_annotate_getters_or_setters() {

        // Given
        final JMethod method = mock(JMethod.class);

        // When
        annotator.propertyGetter(method, someString());
        annotator.propertySetter(method, someString());

        // Then
        verifyZeroInteractions(method);
    }
}