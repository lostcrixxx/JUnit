@LargeTest
@RunWith(AndroidJUnit4.class)
public class ActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public GrantPermissionRule mGrantPermissionRule =
            GrantPermissionRule.grant(
                    "android.permission.ACCESS_FINE_LOCATION",
                    "android.permission.ACCESS_COARSE_LOCATION",
                    "android.permission.WRITE_EXTERNAL_STORAGE");
					
	@Test
    public void connectionTrue() {
        Assert.assertTrue("Conexão", NTGlobals.mConnectedToPeripheral);
    }

    @Test
    public void constantConnectWifi() {
        Assert.assertEquals("wifi", connectionMethod);
    }

    @Test
    public void isAndroidTv() {
        Assert.assertFalse("Resolução de celular", DeviceInformation.isPhone(getContext()));
    }
}