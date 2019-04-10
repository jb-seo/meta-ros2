# FIXME: My intuition says that it should be enough to depend on ament-cmake-native only
#        since ament-cmake has runtime dependencies on all other needed ament-cmake-* packages.
#        Yet in practice all ament-based packages have to depend explicitly on the native
#        ament-cmake-* packages.
DEPENDS_append = " \
    ament-cmake-native \
    ament-cmake-export-definitions-native \
    ament-cmake-export-dependencies-native \
    ament-cmake-export-include-directories-native \
    ament-cmake-export-interfaces-native \
    ament-cmake-export-libraries-native \
    ament-cmake-export-link-flags-native \
    ament-cmake-libraries-native \
    ament-cmake-python-native \
    ament-cmake-target-dependencies-native \
    ament-cmake-include-directories-native \
    ament-cmake-test-native \
"

DEPENDS_append_bouncy = " \
    ament-tools-native \
"

EXTRA_OECMAKE_append = " -DBUILD_TESTING=OFF -DPYTHON_SOABI=cpython-35m-i386-${TARGET_OS}-${LINKER_HASH_STYLE}"
# XXX Without STAGING_DIR_HOST path included, rmw-implementation:do_confiure() fails with:
#
#    "Could not find ROS middleware implementation 'NOTFOUND'"
#
export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}${prefix};${STAGING_DIR_NATIVE}${prefix}"

inherit cmake python3native

FILES_${PN} += " \
    ${libdir}/lib*.so \
"
