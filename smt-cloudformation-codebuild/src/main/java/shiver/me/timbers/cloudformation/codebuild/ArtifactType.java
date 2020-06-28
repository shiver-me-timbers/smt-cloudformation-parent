package shiver.me.timbers.cloudformation.codebuild;

@SuppressWarnings("NullableProblems")
public enum ArtifactType implements CharSequence {
    CODEPIPELINE,
    NO_ARTIFACTS,
    S3;

    @Override
    public int length() {
        return name().length();
    }

    @Override
    public char charAt(int index) {
        return name().charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return name().subSequence(start, end);
    }
}
