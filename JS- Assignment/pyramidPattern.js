let pyramidLeft = (rows) => {
   
    for(let i = 1; i <= rows; i++){
      
      let str = '';
      
      for(let j = 1; j <= i; j++){
        //Count the '*' for each row
        str += '*';
      }
      console.log();
      
      //Print the pyramid pattern for each row
      process.stdout.write(str); 
      
    }
 };