# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Instrumentation library for real-time performance testing"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/realtime_support-release/archive/release/crystal/${PN}/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "42e36b0046184e7656d11d8f0846a012"
SRC_URI[sha256sum] = "16271ef178a15732177f981b5d3e9e15ac1a7d71aea70a1789cd900e5706e5c4"
S = "${WORKDIR}/realtime_support-release-release-crystal-${PN}-0.6.0-0"

inherit catkin
