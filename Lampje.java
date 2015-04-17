int led = 13;

void setup() {                
  pinMode(led, OUTPUT);     
}


void loop() 
{
  while(true)
  {
      digitalWrite(led, HIGH);
      delay(1000);
      digitalWrite(led, LOW);
      delay(1000);
  }

}

/**
 * 1) Een draad vanaf de 5volt naar het begin van de regel van breadbord achterin (power)
 * 2) Een draad van GND naar het breadbord buitenste rij (power)
 * 3) Een draad van een poort naar het breadbord lange poot.
 * 4) Een weerstand van de korte poot van het lampje.
 * 5) Een draad van de andere poot van de weerstand naar de buitenkant, op dezelfde rij waar ook de andere draad naar de GND.
 * 
 * 
 **/
