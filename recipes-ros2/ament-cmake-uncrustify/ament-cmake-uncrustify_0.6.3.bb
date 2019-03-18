# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_uncrustify to check code against styleconventions     using uncrustify."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core ament-cmake-test"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cmake_uncrustify/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c32b7f2908b017c02bcb083244dfc14"
SRC_URI[sha256sum] = "dd0d8f7bb4897aea12bcaa7332787ee370f0518b98fd75632f1f7c41dab95187"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cmake_uncrustify-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
