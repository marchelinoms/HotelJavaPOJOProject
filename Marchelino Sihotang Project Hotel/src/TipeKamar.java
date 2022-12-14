public enum TipeKamar {
    REGULARSINGLEBED("Regular Single Bed"),
    REGULARDOUBLEBED("Regular Double Bed"),
    REGULARTWINBED("Regular Twin Bed"),
    VIPSINGLEBED("VIP Single Bed"),
    VIPDOUBLEBED("VIP Double bed"),
    VIPTWINBED("VIP Twin Bed");

        private String label;

        public String getLabel() {
            return label;
        }
        TipeKamar(String label) {
            this.label = label;
        }
}
