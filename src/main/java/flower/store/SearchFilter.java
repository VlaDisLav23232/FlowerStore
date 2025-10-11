package flower.store;

public interface SearchFilter {
    boolean matches(Flower flower);
}