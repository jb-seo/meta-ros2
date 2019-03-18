# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROSBag2 client library"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "  pluginlib poco-vendor rcutils rosbag2-storage rosidl-generator-cpp rosidl-typesupport-cpp rosidl-typesupport-introspection-cpp shared-queues-vendor"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ee0349a7384bfc3411c6ccf45cd274fd"
SRC_URI[sha256sum] = "f7842e66dda1889291be57a8964b06ca54c0dc1f28617392e2cc3a11811ba274"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.0.6-0"

inherit ament
