# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some sensor data related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/sensor_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "30d2046d6408de6bf8a6afbc8439450b"
SRC_URI[sha256sum] = "09309c9ac332be8eedaf4c74f6342d60be5c8f729079edd2ee26a42ed3029075"
S = "${WORKDIR}/common_interfaces-release-release-crystal-sensor_msgs-0.6.1-0"

inherit ament pythonpath-insane
