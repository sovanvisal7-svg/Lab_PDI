package Lab06_Challenges;
class InsurancePolicy {
    double calculatePremium() {
        return 100.0;
    }
}

class HealthInsurance extends InsurancePolicy {
    @Override
    double calculatePremium() {          
        return 250.0;
    }
}

class CarInsurance extends InsurancePolicy {
    @Override
    double calculatePremium() {          
        return 400.0;
    }

    
    double calculatePremium(int ageOfDriver) {
        if (ageOfDriver < 25) {
            return 400.0 + 200.0;
        }
        return 400.0;
    }

    double calculatePremium(int age, int accidentHistory) {
        return calculatePremium(age) + (accidentHistory * 150.0);
    }
}

public class Ch1_InsurancePolicies {
    public static void main(String[] args) {
        
        InsurancePolicy[] policies = { new InsurancePolicy(), new HealthInsurance(), new CarInsurance() };
        System.out.println("--- Overriding ---");
        for (InsurancePolicy p : policies) {
            System.out.println(p.getClass().getSimpleName() + ": $" + p.calculatePremium());
        }

       
        CarInsurance car = new CarInsurance();
        System.out.println("--- Overloading ---");
        System.out.println("calculatePremium()      : $" + car.calculatePremium());
        System.out.println("calculatePremium(22)    : $" + car.calculatePremium(22));
        System.out.println("calculatePremium(30, 2) : $" + car.calculatePremium(30, 2));
    }
}
