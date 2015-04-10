int rodePin = 12;

int knop = 3;

 void setup()
{
  Serial.begin(9600);
  
  pinMode(rodePin, OUTPUT);
  pinMode(knop, INPUT);
  
}
void loop()
{
  int toestand = digitalRead(knop);
  Serial.print(toestand);
  
  if(digitalRead(knop) == LOW)
  {
    digitalWrite(rodePin, HIGH);
    
  }
  
  if(digitalRead(knop) == LOW)
  {
    digitalWrite(rodePin, LOW);
    
    
  }
  
}
