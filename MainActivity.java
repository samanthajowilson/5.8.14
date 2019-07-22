onEvent("login_btn", "click", function() {
  //add an if-else statement here
  if (getText("password_input") == "ok") {
    setText("access_label", "Access Granted!");
  showElement("greenLock_img");  
  } else {
    setText("access_label", "Access DENIED");
  showElement("redLock_img");
  }
  
});



// You do not need to modify the code in the event handler below.
onEvent("password_input", "click", function() {
  // Hide Images
  hideElement("redLock_img");
  hideElement("greenLock_img");
  // Make text fields blank - ""
  setText("access_label","");
  setText("password_input","");
});
