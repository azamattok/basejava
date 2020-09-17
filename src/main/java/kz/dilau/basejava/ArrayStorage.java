package main.java.kz.dilau.basejava;

public class ArrayStorage {

    Resume[] storage = new Resume[10000];
    private int size = 0;
    //   Resume[] temp = new Resume[10];

    void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;

    }

    void save(Resume r) {
        storage[size] = r;
        //   r.uuid = r.hashCode() + size + "";
        size++;

    }

    Resume get(String uuid) {
        for (Resume resume : storage) {
            if (resume.uuid.equals(uuid)) {
                return resume;
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                storage[i] = null;

                break;
            }
        }
        for (int i = 0, z = 0; i < size; i++) {
            if (storage[i] != null) {
                storage[z] = storage[i];
                z++;
            }
        }
        storage[size - 1] = null;
        size--;

    }

    Resume[] getAll() {

        Resume[] result = new Resume[size];
        for (int i = 0; i < size; i++) {
            result[i] = storage[i];
        }
        return result;
    }

    int size() {
        return size;
    }
}
