# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package provides the environment variables `ROS_VERSION` and `ROS_DISTRO`."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ros_environment-release/archive/release/crystal/ros_environment/2.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a1564c31989ff26bde758d960481ce4"
SRC_URI[sha256sum] = "8c890650a2d0c0bf70cb93ad109a920272f64cba3ac089503891a356d67262a5"
S = "${WORKDIR}/ros_environment-release-release-crystal-ros_environment-2.2.0-0"

inherit catkin
