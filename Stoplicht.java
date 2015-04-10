int rodePin = 11;
int groenePin = 10;
int gelePin = 9;

 void setup()
{
  pinMode(rodePin, OUTPUT);
  pinMode(groenePin, OUTPUT);
  pinMode(gelePin, OUTPUT);

}
void loop()
{
  while(true)
  {
    digitalWrite(rodePin, HIGH);
    delay(5000);
    digitalWrite(rodePin, LOW);
    digitalWrite(gelePin, HIGH);
    delay(2000);
    digitalWrite(gelePin, LOW);
    digitalWrite(groenePin, HIGH);
    delay(5000);a
    digitalWrite(groenePin, LOW);
    
  }
}
