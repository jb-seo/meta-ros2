# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to use Python in the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_python/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "43172d9ee06be2938d846c1a979eb7fa"
SRC_URI[sha256sum] = "6d3abd8fd800d2bf3f9f080f574970491380893b2c83407aa3288aeeb6a83acd"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_python-0.6.0-4"

inherit catkin
