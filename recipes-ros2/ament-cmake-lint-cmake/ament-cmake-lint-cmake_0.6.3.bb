# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_lint_cmake to lint CMake code using cmakelint."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test ament-lint-cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_lint_cmake/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9495a8b0a634ea0481686ee52b27e172"
SRC_URI[sha256sum] = "21cafd2e6980208fc6cf85a2f139f76c684b09339242c48c051d19c87b67423f"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_lint_cmake-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
