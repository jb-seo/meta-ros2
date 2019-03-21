# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pclint to perform static code analysis on C/C++     code using PCLint."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_pclint/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c0471ee44686be2ae8d4ccb6ee0e8d9f"
SRC_URI[sha256sum] = "1c35d4cf6536f7341c2715dd84be45922ac5a2af41655c3007752032f963079c"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_pclint-0.5.2-0"

inherit ros
inherit cmake python3native


BBCLASSEXTEND += "native"