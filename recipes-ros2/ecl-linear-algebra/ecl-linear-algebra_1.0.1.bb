# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ecl frontend to a linear matrix package (currently eigen)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-converters ecl-eigen ecl-exceptions ecl-formatters ecl-license ecl-math sophus"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_linear_algebra/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "516807f9a53c2ebd205d77c50e16a1ff"
SRC_URI[sha256sum] = "f5a5be624ca3ea6bc470d459a4395f3b74944c615c24987124e235922b8be9ea"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_linear_algebra-1.0.1-0"

inherit catkin
