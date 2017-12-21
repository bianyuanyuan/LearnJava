package com.test8;

//nesting a class within a scope
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip trackingSlip = new TrackingSlip("slip");
            String s = trackingSlip.getSlip();
        }//end if
        //out of scope
        //! TrackingSlip trackingSlip1 = new TrackingSlip("slip");
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p=new Parcel6();
        p.track();
    }
}
