import java.util.Iterator;
import java.util.NoSuchElementException;

class NameRepository implements Iterable<String> {
    private String[] names = {"John", "Jane", "Jack", "Jill"};

    @Override
    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return names[index++];
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for (String name : repository) {
            System.out.println("Name: " + name);
        }
    }
}

