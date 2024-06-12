package DataStructures.Arrays;

//https://leetcode.com/problems/design-parking-system/description/

public class _1603 {
    static class ParkingSystem {
        private int big, medium, small;

        enum CarType {
            BIG(1),
            MEDIUM(2),
            SMALL(3);
            CarType(int no) {}
            static CarType parse(int no) {
                if(no == 1) return BIG;
                else if(no == 2) return MEDIUM;
                else return SMALL;
            }
        }

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if(CarType.parse(carType).equals(CarType.BIG))
                if(this.big == 0) return false;
                else this.big--;

            if(CarType.parse(carType).equals(CarType.MEDIUM))
                if(this.medium == 0) return false;
                else this.medium--;

            if(CarType.parse(carType).equals(CarType.SMALL))
                if(this.small == 0) return false;
                else this.small--;

            return true;
        }
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1)); // return true because there is 1 available slot for a big car
        System.out.println(parkingSystem.addCar(2)); // return true because there is 1 available slot for a medium car
        System.out.println(parkingSystem.addCar(3)); // return false because there is no available slot for a small car
        System.out.println(parkingSystem.addCar(1)); // return false because there is no available slot for a big car. It is already occupied.
    }

}
