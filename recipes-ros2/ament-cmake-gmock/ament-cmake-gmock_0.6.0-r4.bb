# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add Google mock-based tests in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_gmock/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b5eb375c90052b2c63254b0be3e30ad"
SRC_URI[sha256sum] = "89cf06d85d33bb9a7174939d3b748439e03605d5aaf581e1e977713898af0ec3"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_gmock-0.6.0-4"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
