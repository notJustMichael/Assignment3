package notjustpackage;


import java.util.Objects;

public class Pet {

    private String id;
    private String name;
    private int age;
    private boolean sex;


    private Pet () { }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public Pet(Builder builder) {
        this.id = builder.id;
        this.age = builder.age;
        this.name = builder.name;
        this.sex = builder.sex;

    }
    public static class Builder {
        private String id;
        private String name;
        private int age;
        private boolean sex;


        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder age(int value) {
            this.age = value;
            return this;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder sex(boolean value) {
            this.sex = value;
            return this;
        }

        public Pet build() {
            return new Pet(this);
        }

    }
    @Override //i. Object Equality
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); //iii. Object Identity
    }
}


