package solution.leetcode.com;

/**
 * Define possible claim states
 *
 * @author a.chernotsky
 */
public enum ClaimState {
    READY("Pending"),
    ACTION_REQUIRED("Pending"),
    REVIEW("Review"),
    APPROVED("Approved"),
    DENIED("Denied");

    public static void main(String[] args) {
//        System.out.println(ClaimState.ACTION_REQUIRED.toString());
//        System.out.println(ClaimState.ACTION_REQUIRED.visibleState);
        System.out.println(ClaimState.toClaimStateByVisibleState("pending"));

    }

    private String visibleState;

    ClaimState(String visibleState){
        this.visibleState = visibleState;
    }

    public String visibleState(){
        return visibleState;
    }

    /**
     * Transform string state representation to ClaimState object. Return null if provided state is incorrect
     *
     * @param state string state representation
     * @return appropriate state from enum
     */
    public static ClaimState toClaimState(String state) {
        for (ClaimState s : ClaimState.values()){
            if (s.name().equalsIgnoreCase(state)){
                return s;
            }
        }
        return null;
    }

    /**
     * Transform string visible (user) state representation to ClaimState object. Return null if provided state is incorrect
     *
     * @param visibleState string state representation
     * @return appropriate state from enum
     */
    public static ClaimState toClaimStateByVisibleState(String visibleState) {
        for (ClaimState s : ClaimState.values()){
            if (s.visibleState().equalsIgnoreCase(visibleState)){
                return s;
            }
        }
        return null;
    }
}
