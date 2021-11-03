class Patient {

    boolean mask = true; // носит маску, -25%
    boolean remote = true; // работает на удалёнке, -60%
    boolean sick = true; // переболел, -30%, +50 антител

    enum Vaccinated {Pfizer, Sputnik, Moderna, AstraZeneca}
    Vaccinated vaccinated = Vaccinated.Pfizer;

}



