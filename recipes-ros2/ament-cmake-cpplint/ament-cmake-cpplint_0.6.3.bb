# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_cpplint to lint C / C++ code using cpplint."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_cpplint/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8981df5afc8a9d44fc216af72d0ab54c"
SRC_URI[sha256sum] = "f8eab9e6f2bcdc6895768f28d6563addc21f9d57e20bc1a68e8990f08c5678df"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_cpplint-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
