# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to add Google mock-based tests in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_gmock/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a80b70bf3da73d3d54d5a686669b624b"
SRC_URI[sha256sum] = "7d8d42b996cb9211ec976e638a6bd2248b6e5c887a485cfb7def5930838d4d83"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_gmock-0.5.1-0"

inherit catkin
