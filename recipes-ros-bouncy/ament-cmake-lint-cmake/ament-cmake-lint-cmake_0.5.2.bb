# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_lint_cmake to lint CMake code using cmakelint."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test ament-lint-cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_lint_cmake/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "df30dd4bca532d670b74882173f006f3"
SRC_URI[sha256sum] = "267d066de87752df41ddeb4143b84a94c5797f375dba74af5110fb6b4ec66960"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_lint_cmake-0.5.2-0"

inherit catkin
