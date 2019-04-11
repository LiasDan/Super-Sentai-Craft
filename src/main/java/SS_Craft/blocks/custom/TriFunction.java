package SS_Craft.blocks.custom;

@FunctionalInterface
public interface TriFunction<T, R, V, U> {
    public U apply(T t, R r, V v);
}
