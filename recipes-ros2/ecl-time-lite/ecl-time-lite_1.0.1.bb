# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a portable set of time functions that are especially useful for      porting other code or being wrapped by higher level c++ classes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/crystal/ecl_time_lite/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "def85c77c2f82660c6408b5d1a7f7935"
SRC_URI[sha256sum] = "0e008aa72773384f0da2906b6562477ca47abdef604076529eac6a19ca179997"
S = "${WORKDIR}/ecl_lite-release-release-crystal-ecl_time_lite-1.0.1-0"

inherit ament
