# Toggle The Bulbs
## There are N bulbs that are initially off. In the first-round, you turn ON all the bulbs, then you turn off every second bulb in the second round.

On the third round, you toggle every third bulb (turning ON if it's OFF or the vice-versa). For the Ith round, you toggle every Ith bulb. For the Nth round, you only toggle the last bulb.

Return the number of bulbs that are on after the N rounds.

Sample Input1: 

3

Sample Output1: 

1

Explanation: 

At first, the three bulbs are [off, off, off].

After the first round, the three bulbs are [on, on, on].

After the second round, the three bulbs are [on, off, on].

After the third round, the three bulbs are [on, off, off]. 

So you should return 1 because there is only one bulb is on.

Sample Input2:

1

Sample Output2: 

1