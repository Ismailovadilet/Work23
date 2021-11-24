package com.company;

    public class Apple extends Fruits {
        private String appleSort;
        private int price;


        public Apple(String name, String colour, double weight, boolean isEdible, boolean isOrganic, String appleSort, int price) {
            super(name, colour, weight, isEdible, isOrganic);
            this.appleSort = appleSort;
            this.price = price;
        }


        @Override
        public boolean check(boolean isEdible){
            return super.check(isEdible);
        }

        @Override
        public void getImport() {
            System.out.println("Можно купить на импорт");
        }

        @Override
        public void getPrice() {
            System.out.println(getName()+" такая цена");
        }
}