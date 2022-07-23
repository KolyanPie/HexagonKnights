package ru.kolyanpie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Field {
    private final List<List<Entity>> field;

    public Field(int size) {
        field = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            field.add(new ArrayList<>(size));
            for (int j = 0; j < size; j++) {
                field.add(null);
            }
        }
    }

    public Entity getEntity(int x, int y) {
        return field.get(x).get(y);
    }

    public void spawn(Entity entity, int x, int y) {
        if (field.get(x).get(y) != null) {
            throw new RuntimeException("can't spawn entity here"); //TODO
        }
        field.get(x).set(y, entity);
    }

    public Field turn() {
        class Cell {
            int x;
            int y;
        }
        Map<Knight, Cell> moves;
//        field.stream().flatMap((a) -> a.stream()).filter()
        //TODO
        return this;
    }

    @Override
    public String toString() {
        return "";
    }
}
