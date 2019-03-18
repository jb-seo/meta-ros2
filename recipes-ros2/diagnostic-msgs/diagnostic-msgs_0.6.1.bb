# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some diagnostics related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/diagnostic_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "64d4a88b90a795644d8fb71b721875cc"
SRC_URI[sha256sum] = "fb8bea9a6b213a575647cb0daa3ae1b271216a254babe767effec9c8b123ae1f"
S = "${WORKDIR}/common_interfaces-release-release-crystal-diagnostic_msgs-0.6.1-0"

inherit ament pythonpath-insane
