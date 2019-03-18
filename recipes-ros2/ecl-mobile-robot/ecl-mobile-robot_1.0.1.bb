# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains transforms (e.g. differential drive inverse kinematics)     for the various types of mobile robot platforms."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-errors ecl-formatters ecl-geometry ecl-license ecl-linear-algebra ecl-math"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_mobile_robot/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b35ded77b1d4580f372e6b03a5d2ba24"
SRC_URI[sha256sum] = "6f5823539daecf82dd626c3bb0737a5e86d5726019d272171217fd7115890500"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_mobile_robot-1.0.1-0"

inherit ament
