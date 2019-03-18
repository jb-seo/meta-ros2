# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Deploys various manipulation algorithms, currently just     feedforward filters (interpolations)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-exceptions ecl-formatters ecl-geometry ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_manipulators/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c0173eaaf2c358d824a7a93d8ca7dc65"
SRC_URI[sha256sum] = "9072031429b88698f4f2afa98037077bbf0256aa6fc11512ea4220f7b15760be"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_manipulators-1.0.1-0"

inherit ament
