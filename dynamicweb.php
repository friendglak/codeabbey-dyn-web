<?php
$modders = 1137;
$result = 1;
do {
    $rand_num = rand(10000, 99999999);
    $result = $rand_num % $modders;
} while ($result > 0);
echo "Random value is " . $rand_num;
?>
