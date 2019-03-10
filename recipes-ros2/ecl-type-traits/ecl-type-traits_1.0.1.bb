# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extends c++ type traits and implements a few more to boot."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-license ecl-mpl"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_type_traits/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96c8b9f09eca37bb499ab586e74e842e"
SRC_URI[sha256sum] = "dba20da2c44d2b510db614738312ff31374fef5dee29c28efba4b1a69c7a29ff"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_type_traits-1.0.1-0"

inherit catkin
