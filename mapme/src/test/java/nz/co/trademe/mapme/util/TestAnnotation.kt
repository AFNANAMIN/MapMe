package nz.co.trademe.mapme.util

class TestAnnotation : nz.co.trademe.mapme.annotations.MarkerAnnotation<TestMap>(nz.co.trademe.mapme.LatLng(0.0, 0.0), "", null, 0f, 1f) {

    override fun annotatesObject(nativeObject: Any): Boolean {
        return false
    }

    override fun addToMap(map: TestMap, context: android.content.Context) {
    }

    override fun removeFromMap(map: TestMap, context: android.content.Context) {
    }

    override fun onUpdateIcon(icon: android.graphics.Bitmap?) {
    }

    override fun onUpdateTitle(title: String?) {
    }

    override fun onUpdatePosition(position: nz.co.trademe.mapme.LatLng) {
    }

    override fun onUpdateZIndex(index: Float) {
    }

    override fun onUpdateAlpha(alpha: Float) {
    }

    override fun toString(): String {
        return "TestAnnotation( position = $position)"

    }


}
