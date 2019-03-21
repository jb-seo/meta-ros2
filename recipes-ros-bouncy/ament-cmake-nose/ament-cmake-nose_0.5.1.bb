# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add nose-based tests in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_nose/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b0fc1dd296879364278ef38b4886bba"
SRC_URI[sha256sum] = "99dc1013dcff7f5ba2f578f7d8a2dbd0b6723cd5c54e9de1098f830530bf44bf"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_nose-0.5.1-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"