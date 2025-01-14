/*Dog.java
  Entity for the Dog
  Author:Wendy Samsodien (218233779)
  Date:03 April 2023
 */
package za.ac.cput.dogparlor.domain;

public class Dog {
    private int dogID;
    private String name;
    private int age;
    private String breed;
    private String hairSize;
    private String hairLength;

    private Dog() {}
    private Dog (Builder builder) {
        this.dogID = builder.dogID;
        this.name = builder.name;
        this.age = builder.age;
        this.breed = builder.breed;
        this.hairSize = builder.hairSize;
        this.hairLength = builder.hairLength;
    }
    public int getDogID() {
        return dogID;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;

    }
    public String getHairSize() {
        return hairSize;
    }
    public String getHairLength() {
        return hairLength;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "dogID='" + dogID + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", breed='" + breed + '\'' +
                ", hairSize='" + hairSize + '\'' +
                ", hairLength='" + hairLength + '\'' +
                '}';
    }


    //implement builder pattern

    public static class Builder {
        private int dogID;
        private String name;
        private int age;
        private String breed;
        private String hairSize;
        private String hairLength;

        public Builder setDogID(int dogID) {
            this.dogID = dogID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;

        }


        public Builder setBreed(String breed) {
            this.breed = breed;
            return this;
        }
        public Builder setHairSize(String hairSize) {
            this.hairSize = hairSize;
            return this;
        }
        public Builder setHairLength(String hairLength) {
            this.hairLength = hairLength;
            return this;
        }


        public Builder copy(Dog dog) {
            this.dogID = dog.dogID;
            this.name = dog.name;
            this.age = dog.age;
            this.breed = dog.breed;
            this.hairSize = dog.hairSize;
            this.hairLength = dog.hairLength;
            return this;

        }
        public Dog build() {
            return new Dog(this);
        }

    }
}
