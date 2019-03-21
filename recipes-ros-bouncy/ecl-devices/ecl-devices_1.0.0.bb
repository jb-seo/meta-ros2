# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an extensible and standardised framework for input-output devices."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-containers ecl-errors ecl-license ecl-mpl ecl-threads ecl-type-traits ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_devices/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f2f8b2da08dcaed81d809af8bbec5e5"
SRC_URI[sha256sum] = "c1cd53a6dc3bd94aea787990165b066ebb417d8b88ad616e4b5f6d41cba03aea"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_devices-1.0.0-0"

inherit ros
inherit ament


