# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add nose-based tests in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_nose/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc2a8b0b9eec68f0b9b17d087e1822b1"
SRC_URI[sha256sum] = "32fe0404b9569af068674686f015a772f9ff0504554ae9d5d98e52f990f258a0"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_nose-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
