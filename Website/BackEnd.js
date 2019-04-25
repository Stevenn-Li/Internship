/**
 * 
 */
// Automatic Slideshow - change image every 3 seconds
            var myIndex = 0;
            carousel();
            function carousel() {
                var i;
                var x = document.getElementsByClassName("mySlides");
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                myIndex++;
                if (myIndex > x.length) {myIndex = 1}
                x[myIndex-1].style.display = "block";
                setTimeout(carousel, 3000);
            }
            
            function disable() {
                var x = document.getElementById("uploadFile");
                x.disabled = true;
            }
            
            function enable() {
                var x = document.getElementById("uploadFile");
                x.disabled = false;
            }
            
            function makeplot() {
  			  Plotly.d3.csv("database1.csv", function(data){ processData(data) } );

  			};

  			function processData(allRows) {

  			  console.log(allRows);
  			  var x = [], y = [];

  			  for (var i=0; i<allRows.length; i++) {
  			    row = allRows[i];
  			    x.push( row['numbers']);
  			    y.push( row['probability'] );
  			  }
  			  console.log( 'X',x, 'Y',y );
  			  makePlotly( x, y );
  			}

  			function makePlotly( x, y ){
  			  var plotDiv = document.getElementById("plot");
  			  var traces = [{
  			    x: x,
  			    y: y
  			  }];

  			  Plotly.newPlot('myDiv', traces,
  			    {title: 'Plotting CSV data from AJAX call'});
  			};
  			  makeplot();
