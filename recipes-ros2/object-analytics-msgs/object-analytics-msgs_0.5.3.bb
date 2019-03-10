# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "object analytics message definition"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a530e7e8bd0b9c8e6d4e5d32904af192"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs object-msgs rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/ros2_object_analytics-release/archive/release/crystal/object_analytics_msgs/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de94add5ab32c0abf03a7d5d0f6fc924"
SRC_URI[sha256sum] = "cfa7e51f2ab2c6e644bb41065ea62712cd8fc4b20e16741eda5d6512ab9619ae"
S = "${WORKDIR}/ros2_object_analytics-release-release-crystal-object_analytics_msgs-0.5.3-0"

inherit catkin
