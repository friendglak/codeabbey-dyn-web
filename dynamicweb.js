function dynamicWeb(rangeMax, rangeMin, secret) {
  return (
    (Math.floor(Math.random() * (rangeMax - rangeMin)) + rangeMin) * secret
  );
}
secret = 1211;
rangeMin = Math.ceil(10000 / secret);
rangeMax = Math.floor(99999999 / secret);

document.getElementById("random").innerHTML =
  "Random value is " + dynamicWeb(rangeMax, rangeMin, secret);
