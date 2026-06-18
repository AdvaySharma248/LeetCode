class Solution {
    public double angleClock(int hour, int m) {
        hour %= 12;

        double hourAngle = hour * 30 + m * 0.5;
        double minAngle = m * 6;

        double diff = Math.abs(hourAngle - minAngle);

        return Math.min(diff, 360 - diff);
    }
}