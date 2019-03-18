# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an extensible and standardised framework for input-output devices."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-config ecl-containers ecl-errors ecl-license ecl-mpl ecl-threads ecl-type-traits ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_devices/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d2144678e25c053704abc7d834260db"
SRC_URI[sha256sum] = "83dee83518c5937165ee4506d6358e714d9cf8fce2fa05c54ab922669e22ddb1"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_devices-1.0.1-0"

inherit ament
