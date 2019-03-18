# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2 is the second generation of the transform library, which lets     the user keep track of multiple coordinate frames over time. tf2     maintains the relationship between coordinate frames in a tree     structure buffered in time, and lets the user transform points,     vectors, etc between any two coordinate frames at any desired     point in time."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " console-bridge-vendor geometry-msgs console-bridge"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/crystal/${PN}/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d5204abfeb70907cc14e02172052639"
SRC_URI[sha256sum] = "33f565f29e58c2675896a0b7dc88df83659a0acd09776f7aa40438ef7713b012"
S = "${WORKDIR}/geometry2-release-release-crystal-${PN}-0.10.1-0"

inherit ament
