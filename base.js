
const firebaseConfig = {
  apiKey: "AIzaSyA6HFMow0Z9mk6MZJajDaUJjxUqnSjTtNc",
  authDomain: "logindomain-e1902.firebaseapp.com",
  databaseURL: "https://logindomain-e1902-default-rtdb.firebaseio.com",
  projectId: "logindomain-e1902",
  storageBucket: "logindomain-e1902.appspot.com",
  messagingSenderId: "221547998650",
  appId: "1:221547998650:web:70cbb113c9fcfd87228183",
  measurementId: "G-MWB81RH7PH"
};
//initialize firebase
 firebase.initializeApp(firebaseConfig);
 var firebaseRef= firebase.database().ref('demo');


document.getSelector('@send').addEventListener('click',()=>
{
    var p=document.f1.pass.value;
    var n=doxument.f1.name.value; 
    firebaseRef.push(demo);
})

