package aws;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Collections.*;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Stream.*;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static shiver.me.timbers.data.random.RandomStrings.someString;

public class ResourceListTest {

    @Test
    public void Instantiation_for_coverage() {
        new ResourceList<>();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_get_resources_from_a_resource_list() {

        final HasName resource1 = mock(HasName.class);
        final HasName resource2 = mock(HasName.class);
        final HasName resource3 = mock(HasName.class);
        final ResourceList list = new ResourceList(new ResourceList(resource1, resource2, resource3));

        final String name1 = someString(3);
        final String name2 = someString(3);
        final String name3 = someString(3);

        // Given
        given(resource1.getName()).willReturn(name1);
        given(resource2.getName()).willReturn(name2);
        given(resource3.getName()).willReturn(name3);

        // When
        final Map actual = list.getResources();

        // Then
        assertThat(actual, allOf(
            (Matcher) hasEntry(name1, resource1),
            (Matcher) hasEntry(name2, resource2),
            (Matcher) hasEntry(name3, resource3)
        ));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void Can_set_resources_in_a_resource_list() {

        final ResourceList list = new ResourceList();

        final HasName resource1 = mock(HasName.class);
        final HasName resource2 = mock(HasName.class);
        final HasName resource3 = mock(HasName.class);
        final HasName resource4 = mock(HasName.class);
        final String name1 = someString(3);
        final String name2 = someString(5);
        final String name3 = someString(8);
        final String name4 = someString(13);

        // Given
        given(resource1.getName()).willReturn(name1);
        given(resource2.getName()).willReturn(name2);
        given(resource3.getName()).willReturn(name3);
        given(resource4.getName()).willReturn(name4);
        list.withResources(resource1)
            .withResourceLists(singletonList(resource2), singletonList(resource3))
            .setResources(of(resource4).collect(toMap(HasName::getName, res -> res)));

        // When
        final Map actual = list.getResources();

        // Then
        assertThat(actual, allOf(
            (Matcher) hasEntry(name1, resource1),
            (Matcher) hasEntry(name2, resource2),
            (Matcher) hasEntry(name3, resource3),
            (Matcher) hasEntry(name4, resource4)
        ));
    }
}