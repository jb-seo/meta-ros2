# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains message and service definitions used by the examples."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "action-msgs ament-cmake rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/example_interfaces-release/archive/release/crystal/example_interfaces/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a24b87b4675066ab35cff5481ae99dd9"
SRC_URI[sha256sum] = "0c93953b378fdd65af4e4b68d46bb155e4dbb2ae469e8f04c9c445e3cdfb8224"
S = "${WORKDIR}/example_interfaces-release-release-crystal-example_interfaces-0.6.2-0"

inherit catkin
